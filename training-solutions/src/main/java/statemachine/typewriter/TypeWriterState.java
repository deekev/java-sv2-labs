package statemachine.typewriter;

public enum TypeWriterState {
    LOWER_CASE {
        @Override
        public TypeWriterState next() {
            return TypeWriterState.UPPER_CASE;
        }
    },
    UPPER_CASE {
        @Override
        public TypeWriterState next() {
            return TypeWriterState.LOWER_CASE;
        }
    };

    public abstract TypeWriterState next();
}
