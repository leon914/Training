import java.util.*;
public class Folder {

  public static void main(String[] args){

    List<File> folder = new ArrayList();

    folder.add(new File("notepad.txt", 22, new Date(1398935709)));
    folder.add(new File("HelloWorld.java", 152, new Date(1477995309)));
    folder.add(new File("whyiwanttodie.txt", 3045, new Date(1398935709)));
    folder.add(new File("Unit 400 LO2.docx", 4578, new Date(1328091309)));
    folder.add(new File("Cremeegg.png", 6803, new Date(1443690909)));
    folder.add(new File("Hierarchy.pptx", 346, new Date(1480587309)));
    folder.add(new File("Scott.txt", 2346, new Date(1483265709)));
    folder.add(new File("kids.jpg", 973, new Date(1477995309)));
    folder.add(new File("stupid.stpd", 9992, new Date(1491038109)));

    System.out.println(folder);

    System.out.println(sorting(folder, Sorting.LARGEST_MEMORY));


  }

  public static List<File> sorting(List<File> folder, Sorting sortValue){
    switch (sortValue){
      case A_Z:
          Collections.sort(folder, new Comparator<File>() {
            public int compare(File f1, File f2) {
                return f1.getName().compareToIgnoreCase(f2.getName());
              }
            });
            break;
      case Z_A:
          Collections.sort(folder, new Comparator<File>() {
            public int compare(File f1, File f2) {
                return f2.getName().compareToIgnoreCase(f1.getName());
              }
            });
            break;
      case DATE_ADDED:
          Collections.sort(folder, new Comparator<File>() {
            public int compare(File f1, File f2) {
                return f1.getdateAdded().compareTo(f2.getdateAdded());
              }
            });
            break;
      case LARGEST_MEMORY:
          Collections.sort(folder, new Comparator<File>() {
            public int compare(File f1, File f2) {
                return f2.getSizeInKbs().compareTo(f1.getSizeInKbs());
              }
            });
            break;
      case LOWEST_MEMORY:
          Collections.sort(folder, new Comparator<File>() {
              public int compare(File f1, File f2) {
                  return f1.getSizeInKbs().compareTo(f2.getSizeInKbs());
                }
            });
            break;
    }
    return folder;
  }

  public enum Sorting {
    A_Z, Z_A, DATE_ADDED, LARGEST_MEMORY, LOWEST_MEMORY
  }
}
