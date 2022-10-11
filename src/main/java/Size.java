public enum Size {
    S("Small"),M("Medium"),L("Large"),X("Extra Large");

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    Size(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Size{" +
                "description='" + description + '\'' +
                '}';
    }
}
