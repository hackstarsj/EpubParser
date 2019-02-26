package ebook.epubreader.app.epubparser;

public interface BookProgressListener {
   void onSuccessfulExecute(String pageno,String progress,String types);
}
