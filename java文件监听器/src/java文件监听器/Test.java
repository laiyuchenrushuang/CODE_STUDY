package java�ļ�������;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

public class Test {

	public static void main(String[] args) {
		File file = new File("D:\\Test"); //�ļ�����
		String  pathStr = file.getPath(); 
		Path path = Paths.get(pathStr);
		try {
			WatchService watchService = FileSystems.getDefault().newWatchService();
			path.register(watchService,StandardWatchEventKinds.ENTRY_CREATE,StandardWatchEventKinds.ENTRY_MODIFY,StandardWatchEventKinds.ENTRY_DELETE);
		      while (true) {
	                final WatchKey key = watchService.take();

	                for (WatchEvent<?> watchEvent : key.pollEvents()) {

	                    final WatchEvent.Kind<?> kind = watchEvent.kind();

	                    if (kind == StandardWatchEventKinds.OVERFLOW) {
	                        continue;
	                    }
	                    //�����¼�
	                    if (kind == StandardWatchEventKinds.ENTRY_CREATE) {
	                    	System.out.println("ENTRY_CREATE");
	                    }
	                    //�޸��¼�
	                    if (kind == StandardWatchEventKinds.ENTRY_MODIFY) {
	                    	System.out.println("ENTRY_MODIFY");
	                    }
	                    //ɾ���¼�
	                    if (kind == StandardWatchEventKinds.ENTRY_DELETE) {
	                    	System.out.println("ENTRY_DELETE");
	                    }
	                    // get the filename for the event
	                    final WatchEvent<Path> watchEventPath = (WatchEvent<Path>) watchEvent;
	                    final Path filename = watchEventPath.context();
	                    // print it out
	                    System.out.println(kind + " -> " + filename);

	                }
	                // reset the keyf
	                boolean valid = key.reset();
	                // exit loop if the key is not valid (if the directory was
	                // deleted,for
	                if (!valid) {
	                    break;
	                }
	            }

	        } catch (IOException | InterruptedException ex) {
	            System.err.println(ex);
	        }
		
	}

}
