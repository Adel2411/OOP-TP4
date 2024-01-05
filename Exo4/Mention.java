package Solution.Exo4;

public enum Mention {
    N("NON ADMIS"), P("PASSABLE"), AB("ASSEZ BIEN"), B("BIEN"), TB("TRES BIEN");

    private String message;

    Mention(String s) { this.message = s;};

    public String MentionMessage() {
        return this.message;
    }
}
