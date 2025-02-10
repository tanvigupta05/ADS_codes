import java.util.HashSet;

class ThrowingHashSet<E> extends HashSet<E> {
    @Override
    public boolean add(E e) {
        if (contains(e)) {
            // The element is already in the set; throw an exception.
            throw new IllegalArgumentException("Duplicate element: " + e);
        }
        return super.add(e);
    }
}

class task {
    public static void main(String[] args) {
        ThrowingHashSet<Integer> set = new ThrowingHashSet<>();
        
        try {
            set.add(10); // First time; works fine.
            set.add(10); // Second time; will throw an exception.
        } catch (IllegalArgumentException ex) {
            System.out.println("Exception caught: " + ex.getMessage());
        }
        
        System.out.println("Set contents: " + set);
    }
}
