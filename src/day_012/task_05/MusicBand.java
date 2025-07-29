package day_012.task_05;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members;

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = new ArrayList<>(members);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public void setMembers(List<MusicArtist> members) {
        this.members = members;
    }

    public boolean addMember(MusicArtist newMember) {
        if (newMember == null || newMember.getName() == null || newMember.getName().isEmpty() || newMember.getAge() <= 0) {
            return false;
        }

        for (MusicArtist existingMember : members) {
            if (existingMember.getName().equals(newMember.getName())) {
                return false;
            }
        }

        members.add(newMember);
        return true;
    }

    public boolean removeMember(MusicArtist member) {
        return members.remove(member);
    }

    public static void transferMembers(MusicBand firstBand, MusicBand secondBand) {
        if (firstBand != null && secondBand != null) {
            System.out.println("\nВсе участники группы " + firstBand.getName() + " переходят в группу " + secondBand.getName());
            secondBand.getMembers().addAll(firstBand.getMembers());
            firstBand.getMembers().clear();
        } else {
            System.out.println("Одна или обе группы - null.");
        }
    }

    public void printMembers() {
        if (members.isEmpty()) {
            System.out.println("У группы " + name + " нет участников..");
        } else {
            StringBuilder sb = new StringBuilder("Участники группы " + name + ": ");
            for (MusicArtist member : members) {
                sb.append(member).append(", ");
            }
            // Удаляем последнюю запятую и пробел, если есть участники
            if (!members.isEmpty()) {
                sb.setLength(sb.length() - 2);
            }
            System.out.println(sb);
        }
    }

    @Override
    public String toString() {
        return name + " (" + year + ")";
    }
}
