import java.lang.*;

class CWars {
    public static String initials(String name) {
        String[] names = name.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < names.length - 1; i++) {
            sb.append(names[i].substring(0,1).toUpperCase() + ".");
        }
        String surname = names[names.length - 1];
        sb.append(surname.substring(0,1).toUpperCase() + surname.substring(1).toLowerCase());

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(initials("Patrick James Cummins"));
        System.out.println(initials("Rishabh Rajendra Pant"));
    }
}