// Download Manager
// Create a class DownloadManager. Create multiple threads using
// Runnable interface. Each thread represents file download.
// Output: Downloading messages.
class DownloadTask implements Runnable {
    String fileName;

    DownloadTask(String fileName) {
        this.fileName = fileName;
    }

    public void run() {
        System.out.println("Downloading " + fileName);
    }
}

public class DownloadManager {
    public static void main(String[] args) {
        Thread t1 = new Thread(new DownloadTask("File1"));
        Thread t2 = new Thread(new DownloadTask("File2"));
        Thread t3 = new Thread(new DownloadTask("File3"));

        t1.start();
        t2.start();
        t3.start();
    }
}