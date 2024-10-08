import java.time.LocalDate;
import java.time.Period;

public class Wine {
    private String wineName;
    private String markName;
    private String countryName;
    private LocalDate date;
    private String description;

    public Wine() {
    }

    public Wine(String wineName, String markName, String countryName, LocalDate date, String description) {
        this.wineName = wineName;
        this.markName = markName;
        this.countryName = countryName;
        this.date = date;
        this.description = description;
    }

    public String getWineName() {
        return wineName;
    }

    public void setWineName(String wineName) {
        this.wineName = wineName;
    }

    public String getMarkName() {
        return markName;
    }

    public void setMarkName(String markName) {
        this.markName = markName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void winePeriod(LocalDate now) {
        System.out.println("Выдержка вина составляет: " +
                Period.between(date, now).getYears() + " лет");
    }
}
