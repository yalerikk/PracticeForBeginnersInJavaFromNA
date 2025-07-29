package day_012.task_03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    protected static ArrayList<MusicBand> musicBands = new ArrayList<>();
    public static ArrayList<MusicBand> musicBandsAfter2000 = new ArrayList<>();

    public static void main(String[] args) {
        addMusicBands();
        System.out.println("Заполнили список музыкальных групп!");

        Collections.shuffle(musicBands);
        System.out.println("Перемешали!");
        print();

        List<MusicBand> musicBandsAfter2000 = groupsAfter2000(musicBands);
        printBandsAfter2000(musicBandsAfter2000);
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> result = new ArrayList<>();
        for (MusicBand band : bands) {
            if (band.getYear() > 2000) {
                result.add(band);
            }
        }
        return result;
    }

    public static void addMusicBands() {
        musicBands.add(new MusicBand("The Beatles", 1960));
        musicBands.add(new MusicBand("Led Zeppelin", 1968));
        musicBands.add(new MusicBand("Queen", 1970));
        musicBands.add(new MusicBand("AC/DC", 1973));
        musicBands.add(new MusicBand("Nirvana", 1987));
        musicBands.add(new MusicBand("Radiohead", 1985));
        musicBands.add(new MusicBand("The Killers", 2001));
        musicBands.add(new MusicBand("Arctic Monkeys", 2002));
        musicBands.add(new MusicBand("Fall Out Boy", 2001));
        musicBands.add(new MusicBand("My Chemical Romance", 2001));
    }

    public static void print() {
        System.out.println("\nСписок музыкальных групп:");
        for (MusicBand band : musicBands) {
            System.out.println(band);
        }
    }

    public static void printBandsAfter2000(List<MusicBand> bandsAfter2000) {
        System.out.println("\nСписок музыкальных групп, основанных после 2000 года:");
        for (MusicBand band : bandsAfter2000) {
            System.out.println(band);
        }
    }
}
