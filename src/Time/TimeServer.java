package Time;

import java.time.LocalDate;

public class TimeServer implements TimeAware{

    @Override
    public LocalDate getActualTime() {

        return null;
    }

//    bizonyos időközönként (mondjuk 10 másodpercenként) értesíti a klienseit a pontos időről.
//    Az, aki a TimeServer kliense akar lenni implementálja a TimeAware interfacet.
//    Az interface garantálja, hogy a TimeServer átadhassa a pontos időt a TimeAware kliensnek.
//    Írd meg a TimeAware interfacet!
//    Írj egy LazyGuy osztályt, ami implementálja a TimeAware interface-t. Ha LazyGuy-nak este nyolc és délelőtt 11 között szól a TimeServer, akkor LazyGuy azt válaszolja (azt írja ki a System.out-ra), hogy “hagyj aludni!”, egyébként azt, hogy “Kösz, hogy szóltál”.
//    Írj egy HungryGuy osztályt! Ha HungryGuy-nak étkezési időben szól a TimeServer ő azt írja ki,, hogy “Juhhuuu reggeli (/ebéd/vacsora) idő.” Egyébként azt, hogy “Juj de éhes vagyok.”

}
