class Disco implements Comparable<Disco> {
        Integer index;
        String movimento;

        Disco(int index, String movimento) {
        this.index = index;
        this.movimento = movimento;
        }

public int compareTo(Disco o) {
        return index.compareTo(o.index);
        }
        }