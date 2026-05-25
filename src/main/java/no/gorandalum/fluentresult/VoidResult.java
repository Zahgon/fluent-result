package no.gorandalum.fluentresult;

import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * A result object which either is in success state with no value, or in error
 * state containing a non-{@code null} error value.
 * <p>
 * A variable whose type is {@code VoidResult} should never itself be
 * {@code null}, it should always point to an {@code VoidResult} instance.
 *
 * @param <E> the type of the error value
 */
@SuppressWarnings("WeakerAccess")
public final class VoidResult<E> extends BaseResult<Void, E> {

    /**
     * Common instance for success {@code VoidResult}.
     */
    private static final VoidResult<?> RESULT_SUCCESS = new VoidResult<>(null);

    private VoidResult(E error) {
        super(null, error, VoidResult.class);
    }

    /**
     * Returns a {@code VoidResult} in success state.
     *
     * @param <E> the type of the error value
     * @return a {@code VoidResult} in success state
     */
    public static <E> VoidResult<E> success() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a {@code VoidResult} in error state containing the given
     * non-{@code null} value as error value.
     *
     * @param value the error value, which must be non-{@code null}
     * @param <E> the type of the error value
     * @return a {@code VoidResult} in error state containing the given error
     * value
     * @throws NullPointerException if given error value is {@code null}
     */
    public static <E> VoidResult<E> error(E value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * If in error state, returns a {@code VoidResult} containing the result of
     * applying the given mapping function to the error value, otherwise returns
     * the unaltered {@code VoidResult} in success state.
     *
     * @param function the mapping function to apply to the error value, if
     * error state
     * @param <N> the type of the value returned from the mapping function
     * @return a {@code VoidResult} containing the result of applying the
     * mapping function to the error value of this {@code VoidResult}, if in
     * error state, otherwise the unaltered {@code VoidResult} in success state
     * @throws NullPointerException if the given mapping function is
     * {@code null} or returns {@code null}
     */
    public <N> VoidResult<N> mapError(Function<? super E, ? extends N> function) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * If in success state, returns a {@code Result} containing the value
     * provided by the given supplier, otherwise returns a {@code Result}
     * containing the error value of this {@code VoidResult}.
     *
     * @param supplier the supplier to provide the value if success state, may
     * not be {@code null}
     * @param <N> the type of the value provided by the supplier
     * @return a {@code Result} containing the value provided by the given
     * supplier, if in success state, otherwise a {@code Result} containing the
     * error value of this {@code VoidResult}
     * @throws NullPointerException if the given supplier is {@code null} or
     * returns {@code null}
     */
    public <N> Result<N, E> replace(Supplier<? extends N> supplier) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * If in success state, returns a {@code OptionalResult} containing the
     * optional value provided by given supplier, otherwise returns a
     * {@code OptionalResult} containing the error value of this
     * {@code VoidResult}.
     *
     * @param supplier the supplier to provide the optional value if success
     * state, may not be {@code null}
     * @param <N> the type of the value which may be present in the
     * {@code Optional} provided by the supplier
     * @return a {@code OptionalResult} containing the optional value provided
     * by the given supplier, if in success state, otherwise a
     * {@code OptionalResult} containing the error value of this
     * {@code VoidResult}
     * @throws NullPointerException if the given supplier is {@code null} or
     * returns {@code null}
     */
    public <N> OptionalResult<N, E> replaceWithOptional(Supplier<Optional<? extends N>> supplier) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * If in success state, returns a {@code BooleanResult} containing the
     * boolean value provided by the given supplier, otherwise returns a
     * {@code BooleanResult} containing the error value of this
     * {@code VoidResult}.
     *
     * @param supplier the supplier to provide the boolean value if success
     * state, may not be {@code null}
     * @return a {@code BooleanResult} containing the boolean value provided by
     * the given supplier, if in success state, otherwise a
     * {@code BooleanResult} containing the error value of this
     * {@code VoidResult}
     * @throws NullPointerException if the given supplier is {@code null} or
     * returns {@code null}
     */
    public BooleanResult<E> replaceWithBoolean(Supplier<Boolean> supplier) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * If in success state, returns the {@code Result} provided by the given
     * supplier, otherwise returns a {@code Result} containing the error value
     * of this {@code VoidResult}.
     *
     * @param <N> the type of success value which may be present in the
     * {@code Result} provided by the supplier
     * @param supplier the supplier to provide the {@code Result}, if success
     * state
     * @return the {@code Result} provided by the supplier, if in success state,
     * otherwise a {@code Result} containing the error value of this
     * {@code VoidResult}
     * @throws NullPointerException if the given supplier is {@code null} or
     * returns {@code null}
     */
    public <N> Result<N, E> flatReplace(Supplier<Result<? extends N, ? extends E>> supplier) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * If in success state, returns the {@code OptionalResult} provided by the
     * given supplier, otherwise returns an {@code OptionalResult} containing
     * the error value of this {@code VoidResult}.
     *
     * @param <N> the type of success value which may be present in the
     * {@code OptionalResult} provided by the supplier
     * @param supplier the supplier to provide the {@code OptionalResult}, if
     * success state
     * @return the {@code OptionalResult} provided by the supplier, if in
     * success state, otherwise an {@code OptionalResult} containing the error
     * value of this {@code VoidResult}
     * @throws NullPointerException if the given supplier is {@code null} or
     * returns {@code null}
     */
    public <N> OptionalResult<N, E> flatReplaceToOptionalResult(Supplier<OptionalResult<? extends N, ? extends E>> supplier) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * If in success state, returns the {@code BooleanResult} provided by the
     * given supplier, otherwise returns a {@code BooleanResult} containing the
     * error value of this {@code VoidResult}.
     *
     * @param supplier the supplier to provide the {@code BooleanResult}, if
     * success state
     * @return the {@code BooleanResult} provided by the supplier, if in
     * success state, otherwise a {@code BooleanResult} containing the error
     * value of this {@code VoidResult}
     * @throws NullPointerException if the given supplier is {@code null} or
     * returns {@code null}
     */
    public BooleanResult<E> flatReplaceToBooleanResult(Supplier<BooleanResult<? extends E>> supplier) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * If in success state, returns the {@code VoidResult} provided by the given
     * supplier, otherwise returns the unaltered {@code VoidResult} in error
     * state.
     *
     * @param supplier the supplier to provide the {@code VoidResult}, if
     * success state
     * @return the {@code VoidResult} provided by the supplier, if in success
     * state, otherwise the unaltered {@code VoidResult} in error state
     * @throws NullPointerException if the given mapping function is
     * {@code null} or returns {@code null}
     */
    public VoidResult<E> flatReplaceToVoidResult(Supplier<VoidResult<? extends E>> supplier) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * If in error state, returns a new {@code VoidResult} in success state,
     * otherwise returns the unaltered {@code VoidResult} in success state.
     *
     * @return a {@code VoidResult} in success state
     */
    public VoidResult<E> recover() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * If in error state, returns the {@code VoidResult} from applying the given
     * mapping function to the error value, otherwise returns the unaltered
     * {@code VoidResult} in success state.
     *
     * @param function the mapping function to apply to the error value to
     * convert to a new {@code VoidResult}, if error state
     * @return the {@code VoidResult} returned from the mapping function, if in
     * error state, otherwise the unaltered {@code VoidResult} in success state
     */
    public VoidResult<E> flatRecover(Function<E, VoidResult<? extends E>> function) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * If in error state, applies the error value to the given consumer,
     * otherwise does nothing.
     *
     * @param errorConsumer the consumer which accepts the error value
     * @return the original {@code VoidResult} unaltered
     * @throws NullPointerException if the given consumer is {@code null}
     */
    public VoidResult<E> consumeError(Consumer<? super E> errorConsumer) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * If in success state, runs the success-runnable. If in error state,
     * applies the error value to the given error-consumer.
     *
     * @param successRunnable the runnable to run if success state
     * @param errorConsumer the consumer which accepts the error value
     * @return the original {@code VoidResult} unaltered
     * @throws NullPointerException if either the given runnable or consumer is
     * {@code null}
     */
    public VoidResult<E> consumeEither(Runnable successRunnable, Consumer<? super E> errorConsumer) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * If in success state, runs the given runnable, otherwise does nothing.
     *
     * @param runnable the runnable to run if success state
     * @return the original {@code VoidResult} unaltered
     * @throws NullPointerException if the given runnable is {@code null}
     */
    public VoidResult<E> runIfSuccess(Runnable runnable) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * If in error state, runs the given runnable, otherwise does nothing.
     *
     * @param runnable the runnable to run if error state
     * @return the original {@code VoidResult} unaltered
     * @throws NullPointerException if the given runnable is {@code null}
     */
    public VoidResult<E> runIfError(Runnable runnable) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * If in success state, runs the given success runnable. If in error state,
     * runs the given error runnable.
     *
     * @param successRunnable the runnable to run if success state
     * @param errorRunnable the runnable to run if error state
     * @return the original {@code VoidResult} unaltered
     * @throws NullPointerException if one of the given runnables is {@code null}
     */
    public VoidResult<E> runEither(Runnable successRunnable, Runnable errorRunnable) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Runs the given runnable, no matter the state.
     *
     * @param runnable the runnable to run
     * @return the original {@code VoidResult} unaltered
     * @throws NullPointerException if the given runnable is {@code null}
     * @deprecated use {@link #runAlways} instead for clarity
     */
    @Deprecated
    public VoidResult<E> run(Runnable runnable) {
        return runAlways(runnable);
    }

    /**
     * Runs the given runnable, no matter the state.
     *
     * @param runnable the runnable to run
     * @return the original {@code VoidResult} unaltered
     * @throws NullPointerException if the given runnable is {@code null}
     */
    public VoidResult<E> runAlways(Runnable runnable) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * If in success state, runs the given supplier. If the supplier returns a
     * {@code VoidResult} in success state, the original {@code VoidResult} is
     * returned unaltered. If the supplier returns a {@code VoidResult} in error
     * state, a {@code VoidResult} containing the error value is returned. If in
     * error state, the original {@code VoidResult} is returned unaltered.
     *
     * @param supplier the supplier to run
     * @return the original {@code VoidResult} unaltered if the given supplier
     * returns success or the original {@code VoidResult} is in error state,
     * otherwise a {@code VoidResult} containing the error value from the
     * supplier result
     * @throws NullPointerException if the given supplier is {@code null} or
     * returns {@code null}
     */
    public VoidResult<E> flatRunIfSuccess(Supplier<? extends VoidResult<? extends E>> supplier) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Retrieve a value from this {@code VoidResult} by folding the states. If
     * in success state, return the value provided by the value-supplier. If in
     * error state, return the value of applying the error-function to the error
     * value.
     *
     * @param <N> the type of retrieved value
     * @param valueSupplier supplier to provide the value, if success state, may
     * return {@code null}
     * @param errorFunction the mapping function to apply to the error value, if
     * error state, may return {@code null}
     * @return the folded value mapped from either the success value or error
     * value, may be {@code null}
     * @throws NullPointerException if either the given supplier or function is
     * {@code null}
     */
    public <N> N fold(Supplier<? extends N> valueSupplier, Function<? super E, ? extends N> errorFunction) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * If in success state, does nothing, otherwise throws the exception returned
     * by the given function.
     *
     * @param <X> type of the exception to be thrown
     * @param function the mapping function producing an exception by applying
     * the error value, if not in success state
     * @throws X if in error state
     * @throws NullPointerException if the given function is {@code null} or
     * returns {@code null}
     */
    public <X extends Throwable> void orElseThrow(Function<? super E, ? extends X> function) throws X {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Transforms this {@code VoidResult} to an {@code OptionalResult}. If in
     * success state, the {@code OptionalResult} will be in empty success state.
     * If in error state, the {@code OptionalResult} will be in error state
     * containing the error value from this {@code VoidResult}.
     * <p>
     * The returned {@code OptionalResult} will never have a value.
     *
     * @param <N> the type of the success value in the returned
     * {@code OptionalResult}, inferred from the variable
     * @return an {@code OptionalResult} in empty success state or in error
     * state containing the error value from this {@code VoidResult}
     */
    public <N> OptionalResult<N, E> toOptionalResult() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Handle the given {@code CheckedRunnable}. If the {@code CheckedRunnable}
     * executes successfully, the {@code VoidResult} will be in success state.
     * If the {@code CheckedRunnable} throws an exception, the
     * {@code VoidResult} will be in error state containing the thrown exception.
     *
     * Note! A custom {@code CheckedRunnable} is used here instead of
     * {@code Runnable} to allow handling of checked exceptions.
     *
     * @param runnable the {@code CheckedRunnable} to handle
     * @return a {@code VoidResult} either in success state, or in error state
     * containing the exception thrown by the {@code CheckedRunnable}
     * @throws NullPointerException if the given runnable is {@code null}
     */
    public static VoidResult<Exception> handle(CheckedRunnable runnable) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Handle the given {@code CheckedRunnable}. If the {@code CheckedRunnable}
     * executes successfully, the {@code VoidResult} will be in success state.
     * If the {@code CheckedRunnable} throws an exception, the
     * {@code VoidResult} will be in error state containing the result after
     * mapping the exception with the given exception mapper function.
     *
     * Note! A custom {@code CheckedRunnable} is used here instead of
     * {@code Runnable} to allow handling of checked exceptions.
     *
     * @param runnable the {@code CheckedRunnable} to handle
     * @param <E> type of the error value after mapping a thrown exception
     * @return a {@code VoidResult} either in success state, or in error state
     * containing the result after mapping the exception thrown by the
     * {@code CheckedRunnable}
     * @throws NullPointerException if the given runnable is {@code null} or
     * the given exception mapper function is {@code null} or returns
     * {@code null}
     */
    public static <E> VoidResult<E> handle(CheckedRunnable runnable, Function<Exception, E> exceptionMapper) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
