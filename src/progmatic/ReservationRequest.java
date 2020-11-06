package progmatic;

import java.time.LocalDate;

public class ReservationRequest {
    LocalDate startDate;
    //    LocalDate date = LocalDate.parse("2017-02-03");
    LocalDate endDate;
    int nrOfPersons;
    String meals;

    public ReservationRequest(LocalDate startDate, LocalDate endDate, int nrOfPersons, String meals) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.nrOfPersons = nrOfPersons;
        this.meals = meals;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public int getNrOfPersons() {
        return nrOfPersons;
    }

    public void setNrOfPersons(int nrOfPersons) {
        this.nrOfPersons = nrOfPersons;
    }

    public String getMeals() {
        return meals;
    }

    public void setMeals(String meals) {
        this.meals = meals;
    }
}
