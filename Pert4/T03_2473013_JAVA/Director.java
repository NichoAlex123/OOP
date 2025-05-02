package T03_2473013_JAVA;
public class Director {
    public static void main(String[] args) {
        Librarian librarian = new Librarian("Alice", "alice@example.com", "08123456789", 2373009, "Fiction Comic");
        Member member = new Member("Cheshire", "chesire@example.com", "08987654321", 2373019, "22 05 2002", null);

        System.out.println(librarian.DisplayRole());
        System.out.println(member.DisplayRole());

        member.pinjam("1010101010101", "11 02 2025");

    }
}