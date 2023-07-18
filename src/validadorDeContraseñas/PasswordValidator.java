package validadorDeContraseñas;

public class PasswordValidator {
    public String securityLevel(String password){
        String level;
        int count=0;

        if (minimumLength(password)) count++;
        else return "Low";

        if (containsSpecialCharacters(password)) count++;
        if (containsCapital(password)) count++;
        if (containsNumber(password)) count++;

        if (count<2) level="Low";
        else if (count<4) level="Acceptable";
        else level="Strong";

        return level;
    }
    public boolean minimumLength(String password){
        return password.length()>=8;
    }
    public boolean containsSpecialCharacters(String password){
        for(char c : password.toCharArray()){
            if (!Character.isLetterOrDigit(c)) return true;
        }

        return false;
    }
    public boolean containsCapital(String password){
        for (char c : password.toCharArray()){
            if (Character.isUpperCase(c)) return true;
        }

        return false;
    }
    public boolean containsNumber(String password){
        for (char c : password.toCharArray()){
            if (Character.isDigit(c)) return true;
        }

        return false;
    }
}
