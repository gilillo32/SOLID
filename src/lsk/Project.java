package lsk;

import java.util.Vector;

public class Project{
    public Vector<StorableAndReadableProjectFile> storableAndReadableProjectFiles = new Vector<>();
    public Vector<ReadOnlyProjectFile> readOnlyProjectFiles = new Vector<>();

    public void addFile(ProjectFile p){
        if (p instanceof StorableAndReadableProjectFile){
            storableAndReadableProjectFiles.add((StorableAndReadableProjectFile) p);
        }
        else if(p instanceof ReadOnlyProjectFile){
            readOnlyProjectFiles.add((ReadOnlyProjectFile) p);
        }
    }
    public void loadAllFiles(){
        for (StorableAndReadableProjectFile f:storableAndReadableProjectFiles)
            f.loadFile();
        for (ReadOnlyProjectFile f:readOnlyProjectFiles)
            f.loadFile();
    }
    public void storeAllFiles(){
        for (StorableAndReadableProjectFile f:storableAndReadableProjectFiles)
            f.storeFile();
    }
}
