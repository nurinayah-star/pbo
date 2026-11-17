import java.util.ArrayList;
import java.util.List;


abstract class Animal {
    private String name;
    private String species;

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public String getName() { return name; }
    public String getSpecies() { return species; }
    
    // Metode abstrak yang akan diimplementasikan oleh kelas anak
    public abstract void makeSound();
}

// Kelas Anak 1 (Mewarisi Animal)
class Lion extends Animal {
    public Lion(String name) {
        super(name, "Singa");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " si Singa mengaum: ROAARR!");
    }
}

// Kelas Anak 2 (Mewarisi Animal)
class Elephant extends Animal {
    public Elephant(String name) {
        super(name, "Gajah");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " si Gajah bersuara: PREEETTT!");
    }
}

// ==========================================
// 2. AGREGASI (Aggregation) & ASOSIASI (Bagian 1)
// ==========================================
class Enclosure {
    private String id;
    // AGREGASI: Kandang memiliki daftar Hewan. 
    // Jika Kandang dihancurkan, objek Animal tetap ada.
    private List<Animal> animals;

    public Enclosure(String id) {
        this.id = id;
        this.animals = new ArrayList<>();
    }

    public String getId() { return id; }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void showAnimals() {
        System.out.println("Hewan di Kandang " + id + ":");
        for (Animal a : animals) {
            System.out.println("- " + a.getName() + " (" + a.getSpecies() + ")");
            a.makeSound();
        }
    }
}

// ==========================================
// 3. ASOSIASI (Association)
// ==========================================
class Zookeeper {
    private String name;

    public Zookeeper(String name) {
        this.name = name;
    }

    // ASOSIASI: Hubungan kerja/interaksi antara Zookeeper dan Enclosure via parameter metode
    public void inspectEnclosure(Enclosure enclosure) {
        System.out.println("\n[Asosiasi] Penjaga " + this.name + " sedang memeriksa Kandang " + enclosure.getId());
        enclosure.showAnimals();
    }
}

// ==========================================
// 4. KOMPOSISI (Composition)
// ==========================================
class Zoo {
    private String zooName;
    // KOMPOSISI: Kebun Binatang membuat dan memiliki objek Enclosure secara langsung di dalamnya.
    // Kandang dibuat di dalam constructor Zoo dan siklus hidupnya bergantung pada Zoo.
    private List<Enclosure> enclosures;

    public Zoo(String zooName) {
        this.zooName = zooName;
        this.enclosures = new ArrayList<>();
        
        // Membuat Kandang secara langsung (Komposisi)
        enclosures.add(new Enclosure("A1 - Zona Karnivora"));
        enclosures.add(new Enclosure("B1 - Zona Herbivora"));
    }

    public Enclosure getEnclosure(int index) {
        if (index >= 0 && index < enclosures.size()) {
            return enclosures.get(index);
        }
        return null;
    }

    public void displayZooInfo() {
        System.out.println("--- Selamat Datang di " + zooName + " ---");
    }
}

// ==========================================
// MAIN CLASS
// ==========================================
public class Main {
    public static void main(String[] args) {
        // 1. Inisialisasi Kebun Binatang (Komposisi: Kandang otomatis tercipta di dalamnya)
        Zoo myZoo = new Zoo("Gembira Loka");
        myZoo.displayZooInfo();

        // 2. Membuat Objek Hewan secara mandiri
        Animal simba = new Lion("Simba");
        Animal dumbbo = new Elephant("Dumbo");

        // 3. Memasukkan hewan ke kandang (Agregasi)
        Enclosure carnivoreEnclosure = myZoo.getEnclosure(0); // Mengambil kandang A1
        Enclosure herbivoreEnclosure = myZoo.getEnclosure(1); // Mengambil kandang B1

        if (carnivoreEnclosure != null) carnivoreEnclosure.addAnimal(simba);
        if (herbivoreEnclosure != null) herbivoreEnclosure.addAnimal(dumbbo);

        // 4. Membuat Penjaga Binatang dan melakukan tugasnya (Asosiasi)
        Zookeeper budi = new Zookeeper("Pak Budi");
        budi.inspectEnclosure(carnivoreEnclosure);
        budi.inspectEnclosure(herbivoreEnclosure);
    }
}
