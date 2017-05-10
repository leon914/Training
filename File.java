import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDateTime;


public class File {

  String name;
  int sizeInKbs;
  Date dateAdded;

  public File(String name, int sizeInKbs, Date dateAdded) {
  this.name = name;
  this.sizeInKbs = sizeInKbs;
  this.dateAdded = dateAdded;
  }

  public String getName(){
    return this.name;
  }

  public Date getdateAdded(){
    return this.dateAdded;
  }

  public Integer getSizeInKbs(){
    return this.sizeInKbs;
  }

  public String toString() {
    return this.name + ", " + this.sizeInKbs + "kb, Date Added:" + dateAdded.toString() + "\n";
  }
}
