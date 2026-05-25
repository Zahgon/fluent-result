package no.gorandalum.fluentresult;

import java.util.Objects;
import java.util.Optional;

abstract class BaseResult<T, E> {

    private final T value;

    private final E error;

    private final Class clazz;

    BaseResult(T value, E error, Class clazz) {
        this.value = value;
        this.error = error;
        this.clazz = clazz;
    }

    T value() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    Optional<T> valueOpt() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    E error() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    Optional<E> errorOpt() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    boolean isSuccess() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean equals(Object o) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int hashCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
