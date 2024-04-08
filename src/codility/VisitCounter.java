package codility;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class VisitCounter {

    Map<Long, Long> count(Map<String, UserStats>... visits) {
        //
        if (visits == null || visits.length == 0) {
            return null;
        }

        return Arrays.stream(visits)
                .filter(Objects::nonNull)
                .flatMap(m -> m.entrySet().stream())
                .filter(e -> isParseableLong(e.getKey())
                        && e.getValue() != null
                        && e.getValue().visitCount.isPresent())
                .collect(Collectors.groupingBy(e -> Long.parseLong(e.getKey()),
                        Collectors.summingLong(e -> e.getValue().visitCount.get())));
    }

    private boolean isParseableLong(String s) {
        try {
            Long.parseLong(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    class UserStats {
        Optional<Long> visitCount;
    }
}
