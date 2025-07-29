package day_012.task_04;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static ArrayList<MusicBand> musicBands = new ArrayList<>();

    public static void main(String[] args) {
        addMusicBands();
        System.out.println("Заполнили список музыкальных групп!");
        print();

        var nirvana = musicBands.get(4);
        String member = "Kirill Bledny";
        addBandMember(nirvana, member);
        deleteBandMember(nirvana, member);

        var firstBand = musicBands.getFirst();
        var secondBand = musicBands.get(2);
        printBandsMembers(firstBand, secondBand);

        MusicBand.transferMembers(firstBand, secondBand);
        printBandsMembers(firstBand, secondBand);
    }

    protected static void deleteBandMember(MusicBand band, String member) {
        System.out.println("\n--- Удаление ---");
        band.printMembers();
        boolean removed = band.removeMember(member);
        System.out.println("Участник \"" + member + "\" удален: " + removed);
        band.printMembers();
    }

    protected static void addBandMember(MusicBand band, String member) {
        System.out.println("\n--- Добавление ---");
        band.printMembers();
        boolean added = band.addMember(member);
        System.out.println("Участник \"" + member + "\" добавлен: " + added);
        band.printMembers();
    }

    private static MusicBand createBand(String name, int year, List<String> members) {
        return new MusicBand(name, year, new ArrayList<>(members));
    }

    public static void addMusicBands() {
        musicBands.add(createBand("The Beatles", 1960, List.of("John Lennon", "Paul McCartney", "George Harrison", "Ringo Starr")));
        musicBands.add(createBand("Led Zeppelin", 1968, List.of("Robert Plant", "Jimmy Page", "John Paul Jones", "John Bonham")));
        musicBands.add(createBand("Queen", 1970, List.of("Freddie Mercury", "Brian May", "Roger Taylor", "John Deacon")));
        musicBands.add(createBand("AC/DC", 1973, List.of("Angus Young", "Bon Scott", "Malcolm Young", "Brian Johnson")));
        musicBands.add(createBand("Nirvana", 1987, List.of("Kurt Cobain", "Krist Novoselic", "Dave Grohl")));
        musicBands.add(createBand("Radiohead", 1985, List.of("Thom Yorke", "Jonny Greenwood", "Ed O'Brien", "Colin Greenwood", "Phil Selway")));
        musicBands.add(createBand("The Killers", 2001, List.of("Brandon Flowers", "Mark Stoermer", "Dave Keuning", "Ronnie Vannucci Jr.")));
        musicBands.add(createBand("Arctic Monkeys", 2002, List.of("Alex Turner", "Jamie Cook", "Nick O'Malley", "Matt Helders")));
        musicBands.add(createBand("Fall Out Boy", 2001, List.of("Patrick Stump", "Pete Wentz", "Joe Trohman", "Andy Hurley")));
        musicBands.add(createBand("My Chemical Romance", 2001, List.of("Gerard Way", "Mikey Way", "Ray Toro", "Frank Iero")));
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
