package lsk;

public class ReadOnlyProjectFile extends ProjectFile implements Loadable{
    public ReadOnlyProjectFile(String filePath) {
        super(filePath);
    }
    public void storeFile() {
        System.out.println("ERROR, can not be Saved");
    }

    @Override
    public void loadFile(){
        System.out.println("File loaded from " + filePath);
    }
}