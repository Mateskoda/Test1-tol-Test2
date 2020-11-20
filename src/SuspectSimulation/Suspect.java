package SuspectSimulation;

interface Suspect {
    boolean confess(Suspect other);
    void setPunishment (Suspect other);
//    Fogolydilemma
//    A fogolydilemma a következő:
//    Egy súlyos bűntény kapcsán két gyanúsítottat letartóztat a rendőrség. Mivel nem áll
//    rendelkezésre elegendő bizonyíték a vádemeléshez, ezért elkülönítik őket egymástól és
//    mindkettejüknek ugyanazt az ajánlatot teszik. Amennyiben az első fogoly vall és társa hallgat,
//    akkor az előbbi büntetés nélkül elmehet, míg a másik, aki nem vallott, 3 év börtönt kap. Ha az első
//    tagadja meg a vallomást és a második vall, akkor a másodikat fogják elengedni és az első kap 3 évet.
//    Ha egyikük sem vall, akkor egy kisebb bűntényért 1 évet kapnak mindketten.
//    Ha mindketten vallanak, mindegyikük 2 évet kap.
//    Az alábbi táblázattal foglalható össze a játék:
//
//    Egyik tagad
//    Egyik vall
//    Másik tagad
//    Mindketten 1 évet kapnak
//    Egyik szabad, másik 3 évet kap
//    Másik vall
//    Egyik 3 évet kap, másik szabad
//    Mindkettő 2 évet kap
//    A fogolydilemmában az a dilemma, hogy a saját érdekeit néző fogoly racionális döntésének
//    az tűnik, hogy vall, hiszen ha a másik nem vall, de én igen,
//    akkor én egyáltalán nem ülök, ha pedig ő is vall
//    és én is még mindig kevesebbet ülök, mintha ő vall és én nem.
//    Ugyanakkor viszont, ha a foglyok a racionalitást követik,
//    mintketten rosszabbul járnak, mintha a betyárbecsületet követnék és egyikük sem vallana
//    (kooperálnának).

}

