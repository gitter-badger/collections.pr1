package school.lemon.changerequest.java.collections.pr1;

import java.util.Iterator;

public interface ConditionalIterator<E> extends Iterator<E> {
    /**
     * Returns {@link Filter} object, that is used in current iterator
     *
     * @return Filter object, that is used in current iterator
     */
    Filter<E> filter();
}
