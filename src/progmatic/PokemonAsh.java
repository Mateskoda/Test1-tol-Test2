package progmatic;

public class PokemonAsh {

    private static final   Pokemon B = new Pokemon("Balbassaur", "leaf", "water");
    private static final   Pokemon P = new Pokemon ("Pikatchu", "electric", "water");
    private static final   Pokemon C= new Pokemon ("Charizard", "fire", "leaf");
    private static final    Pokemon S = new Pokemon ("Squirtle", "water"," fire");
    private static final    Pokemon K = new Pokemon ("Kingler", "water", "fire");
    private static final  Pokemon wildPokemon = new Pokemon ("Odish", "leaf", "water");
    private static final Pokemon [] pokemons= {B, P, C, S, K};

    public static void main(String[] args) {
        System.out.println(witchPokemonFight());

    }
    public static String witchPokemonFight ( ){
        for (int i = 0; i < pokemons.length; i++) {
            if (pokemons[i].isEffectiveAgainst(wildPokemon)){
                return pokemons[i].name;
            }
        }return null;
    }
}

