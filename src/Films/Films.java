package Films;

import Film.Film;

import java.util.LinkedList;
import java.util.List;

public class Films {

    List<Film> films;

    public Films(){
        films = new LinkedList<Film>();
    }

    public boolean addFilm(Film film) {
        return films.add(film);
    }

    public void clear(){
        films.clear();
    }

    public int size(){
        return films.size();
    }

    public Film get(int index){
        return films.get(index);
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        int count = 0;
        for (Film f : films) {
            sb.append("Film ").append(count++).append(f.toString()).append("\n");
        }
        return new String(sb);
    }
}
