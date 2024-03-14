package Zadanie2;

public class PreferredPL implements PreferredLanguage{
    @Override
    public String translate(String adContent) {
        return adContent +" Tłumacze na język polski";
    }
}
