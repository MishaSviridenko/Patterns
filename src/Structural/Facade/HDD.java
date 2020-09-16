package Structural.Facade;

class HDD {

    void copyFromDVD(DVDRom dvd) {
        if (dvd.hasData()) {
            System.out.println("File copying is in progress.");
        } else {
            System.out.println("Enter dvd.");
        }
    }
}
