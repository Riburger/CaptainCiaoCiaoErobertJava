/*public static boolean isProbablyApproaching( String[] signs ) {
final int MIN_OCCURRENCES = 4;
        if ( signs.length < MIN_OCCURRENCES )
        return false;
        for ( int i = 0, count = 1; i < signs.length - 1; i++ ) {
        String currentSign = Objects.requireNonNull( signs[ i ] );
        String nextSign = Objects.requireNonNull( signs[ i + 1 ] );
        if ( currentSign.equals( nextSign ) ) {
        count++;
        if ( count == MIN_OCCURRENCES )
        return true;
        }
        else // ! currentSign.equals( nextSign )
        count = 1;
        }
        return false;
        }*/