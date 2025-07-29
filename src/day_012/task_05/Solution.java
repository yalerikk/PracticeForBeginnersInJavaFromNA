package day_012.task_05;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static ArrayList<MusicBand> musicBands = new ArrayList<>();

    public static void main(String[] args) {
        addMusicBands();
        System.out.println("Заполнили список музыкальных групп!");
        print();

        var firstBand = musicBands.getFirst();
        var secondBand = musicBands.get(1);

        // + and -
        MusicArtist member = createArtist("Egor Caban", 36);
        addBandMember(firstBand, member);
        deleteBandMember(firstBand, member);

        //
        printBandsMembers(firstBand, secondBand);

        MusicBand.transferMembers(firstBand, secondBand);
        printBandsMembers(firstBand, secondBand);
    }

    protected static void deleteBandMember(MusicBand band, MusicArtist member) {
        System.out.println("\n--- Удаление ---");
        band.printMembers();
        boolean removed = band.removeMember(member);
        System.out.println("Участник \"" + member + "\" удален: " + removed);
        band.printMembers();
    }

    protected static void addBandMember(MusicBand band, MusicArtist member) {
        System.out.println("\n--- Добавление ---");
        band.printMembers();
        boolean added = band.addMember(member);
        System.out.println("Участник \"" + member + "\" добавлен: " + added);
        band.printMembers();
    }

    private static MusicArtist createArtist(String name, int age) {
        return new MusicArtist(name, age);
    }

    private static MusicBand createBand(String bandName, int year, List<MusicArtist> artists) {
        return new MusicBand(bandName, year, artists);
    }

    public static void addMusicBands() {
        List<MusicArtist> nirvanaMembers = new ArrayList<>();
        nirvanaMembers.add(createArtist("Kurt Cobain", 36));
        nirvanaMembers.add(createArtist("Krist Novoselic", 39));
        nirvanaMembers.add(createArtist("Dave Grohl", 35));
        musicBands.add(createBand("Nirvana", 1987, nirvanaMembers));

        List<MusicArtist> queenMembers = new ArrayList<>();
        queenMembers.add(createArtist("Freddie Mercury", 58));
        queenMembers.add(createArtist("Brian May", 57));
        queenMembers.add(createArtist("Roger Taylor", 55));
        queenMembers.add(createArtist("John Deacon", 53));
        musicBands.add(createBand("Queen", 1970, queenMembers));

        List<MusicArtist> beatlesMembers = new ArrayList<>();
        beatlesMembers.add(createArtist("John Lennon", 40));
        beatlesMembers.add(createArtist("Paul McCartney", 45));
        beatlesMembers.add(createArtist("George Harrison", 42));
        beatlesMembers.add(createArtist("Ringo Starr", 55));
        musicBands.add(createBand("The Beatles", 1960, beatlesMembers));

        List<MusicArtist> zeppelinMembers = new ArrayList<>();
        zeppelinMembers.add(createArtist("Robert Plant", 56));
        zeppelinMembers.add(createArtist("Jimmy Page", 60));
        zeppelinMembers.add(createArtist("John Paul Jones", 58));
        zeppelinMembers.add(createArtist("John Bonham", 56));
        musicBands.add(createBand("Led Zeppelin", 1968, zeppelinMembers));
    }

    public static void print() {
        System.out.println("\nСписок музыкальных групп:");
        for (MusicBand band : musicBands) {
            System.out.println(band);
        }
    }

    public static void printBandsMembers(MusicBand firstBand, MusicBand secondBand) {
        System.out.println("\nСписок участников музыкальных групп:");
        firstBand.printMembers();
        secondBand.printMembers();
    }
}
