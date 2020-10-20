package edu.progmatic;

public class Pokemon {
  String name;
   String type;
  String effectiveAgainst;

    public Pokemon(String name, String type, String effectiveAgainst) {
        this.name = name;
        this.type = type;
        this.effectiveAgainst = effectiveAgainst;
    }

    public boolean isEffectiveAgainst(Pokemon p) {
        if (effectiveAgainst.equals(p.type)){
            return true;
        }else{
            return false;
        }


            }


}
