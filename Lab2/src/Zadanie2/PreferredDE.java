package Zadanie2;

public class PreferredDE implements PreferredLanguage{
    @Override
    public String translate(String adContent) {
        return adContent + " Übersetzer ins Deutsche";
    }
}