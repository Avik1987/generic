import java.util.Date;


public class UserLibrary implements Comparable<UserLibrary>{
    int Id;
    String name;
    String surname;

    public UserLibrary(int id, String name, String surname/*Date returnBook*/) {
        Id = id;
        this.name = name;
        this.surname = surname;
     //   ReturnBook = returnBook;
    }

   // Date ReturnBook = new Date();


    @Override
    public int compareTo(UserLibrary userLibrary){
    return this.Id-userLibrary.Id;


    }

    @Override
    public String toString() {
        return "UserLibrary{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}

