package progmatic;

import java.util.Comparator;

public class ArtistSortByName implements Comparator<Artist> {
    @Override
    public int compare(Artist o1, Artist o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
