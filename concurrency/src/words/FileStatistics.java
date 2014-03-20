package words;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class FileProcessor {
	private ExecutorService executor = Executors.newCachedThreadPool();
	CompletionService<Integer> completionService = 
		       new ExecutorCompletionService<Integer>(executor);
	
	private String fileName;
	
	public FileProcessor(String fileName){
		this.fileName = fileName;
		
	}
	
	public int count(String whatToCount) throws FileNotFoundException, IOException, InterruptedException, ExecutionException{
		int characterCount = 0;
		int lineCount = 0;
		InputStreamReader is = new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream(fileName));
		
		BufferedReader reader = new BufferedReader(is);
		String line = null;
		while((line = reader.readLine()) != null){
			completionService.submit(new CharacterCount(line, whatToCount));
			lineCount++;
		}
		
		
		for(int i=0; i < lineCount; i++){
			characterCount += completionService.take().get();
		}
		
		
		executor.shutdown();
		return characterCount;
	}
	
}

public class FileStatistics {
 
	public static void main(String[] args) {
		if(args.length != 2){
			System.out.println("Please supply the file name and what to count (c or w ) as a command line argument");
			System.exit(0);
		}
		String file = args[0];
		String whatToCount = args[1];
		FileProcessor fileProcessor = new FileProcessor(file);
		int count=0;
		try {
			count = fileProcessor.count(whatToCount);
		} catch (FileNotFoundException e) {
			System.out.format("File %s not found%n", file);
			System.exit(0);
		}catch(IOException e){
			System.out.format("Error reading file %s%n", file);
			System.exit(0);
		}catch(Exception e){
			System.out.format("Error reading file %s%n", file);
			System.exit(0);
			
		}

		if(args[1].equals("c")){
			System.out.format("File: %s has %d characters%n", file, count);
		}else{
			System.out.format("File: %s has %d words%n", file, count);
		}
	}

}
