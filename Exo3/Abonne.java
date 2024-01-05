package Solution.Exo3;

public class Abonne {
    private String Name, PhoneNumber;

    public Abonne(String Name, String PhoneNumber) {
        this.Name = Name;
        this.PhoneNumber = PhoneNumber;
    }
    public Abonne(String PhoneNumber) {
        this.Name = "INCONNUE";
        this.PhoneNumber = PhoneNumber;
    }
    public Abonne() {
        this.Name = "INCONNUE";
        this.PhoneNumber = "NUMERO MASQUE";
    }

    public String getName() {
        return this.Name;
    }

    public String getPhNumber() {
        return this.PhoneNumber;
    }

    @Override
    public String toString() {
        return "Nom : " + this.getName() + "\nTelephone: "+this.getPhNumber();
    }
}
