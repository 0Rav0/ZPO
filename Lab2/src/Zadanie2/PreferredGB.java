package Zadanie2;

public class PreferredGB implements PreferredLanguage{
    @Override
    public String translate(String adContent) {
        return adContent + " Translate into English";
    }
}
