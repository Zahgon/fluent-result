package no.gorandalum.fluentresult;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

final class Implementations {

    private Implementations() {
    }

    static <T, E, R extends BaseResult<T, E>> T orElse(T other, R instance) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static <T, E, R extends BaseResult<T, E>> T orElseGet(Function<? super E, ? extends T> function, R instance) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static <T, E, R extends BaseResult<T, E>, X extends Throwable> T orElseThrow(Function<? super E, ? extends X> function, R instance) throws X {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static <T, E, N, R extends BaseResult<T, E>> N fold(Function<? super T, ? extends N> valueFunction, Function<? super E, ? extends N> errorFunction, R instance) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static <T, E, R extends BaseResult<T, E>> R consume(Consumer<? super T> consumer, R instance) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static <T, E, R extends BaseResult<T, E>> R consumeError(Consumer<? super E> consumer, R instance) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static <T, E, R extends BaseResult<T, E>> R consumeEither(Consumer<? super T> valueConsumer, Consumer<? super E> errorConsumer, R instance) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static <T, E, R extends BaseResult<T, E>> R runIfSuccess(Runnable runnable, R instance) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static <T, E, R extends BaseResult<T, E>> R runIfError(Runnable runnable, R instance) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static <T, E, R extends BaseResult<T, E>> R runEither(Runnable successRunnable, Runnable errorRunnable, R instance) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static <T, E, R extends BaseResult<T, E>> R runAlways(Runnable runnable, R instance) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static <T, E, R extends BaseResult<T, E>> R flatRunIfSuccess(Supplier<? extends BaseResult<Void, ? extends E>> supplier, Function<E, R> errorConstructor, R instance) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static <T, E, R extends BaseResult<T, E>> R verify(Predicate<? super T> predicate, Supplier<? extends E> errorSupplier, Function<E, R> errorConstructor, R instance) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static <T, E, R extends BaseResult<T, E>> R flatConsume(Function<? super T, ? extends BaseResult<Void, ? extends E>> function, Function<E, R> errorConstructor, R instance) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static <T, E, N, NR, R extends BaseResult<T, E>> NR map(Function<? super T, ? extends N> function, Function<? super N, NR> successConstructor, Function<? super E, NR> errorConstructor, R instance) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static <T, E, N, NR, R extends BaseResult<T, E>> NR mapError(Function<? super E, ? extends N> function, Function<? super N, NR> errorConstructor, R instance) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static <T, E, N, NR extends BaseResult<? extends N, ? extends E>, R extends BaseResult<T, E>> NR flatMap(Function<? super T, ? extends NR> function, R instance) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static <T, E, N, NR extends BaseResult<? extends N, ? extends E>, R extends BaseResult<T, E>> NR flatMap(Function<? super T, ? extends NR> function, R instance, Function<? super E, ? extends NR> errorConstructor) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static <T, E, N, NR extends BaseResult<? extends N, ? extends E>, R extends BaseResult<T, E>> NR flatRecover(Function<? super E, ? extends NR> function, R instance) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static <T, E, R extends BaseResult<T, E>> R recover(Function<E, T> function, Function<T, R> successConstructor, R instance) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
