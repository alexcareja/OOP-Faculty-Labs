package dataprocessing;

import storage.DataRepository;
import storage.SensorData;

import java.util.concurrent.TimeUnit;

public class FilteredStepCountStrategy implements StepCountStrategy {
    private static final int MAX_DIFF_STEPS_CONSECUTIVE_RECORDS = 1000;
    private static final long TIME_FOR_MAX_DIFF = TimeUnit.SECONDS.toMillis(1);
    private DataRepository dataRepository;

    public FilteredStepCountStrategy(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    @Override
    public int getTotalSteps() {
        int totalSteps = 0;
        long time = dataRepository.getData().get(0).getTimestamp();
        for(SensorData s : dataRepository.getData()) {
            if((s.getTimestamp() - time < TIME_FOR_MAX_DIFF
                    && s.getStepsCount() > MAX_DIFF_STEPS_CONSECUTIVE_RECORDS)
                    || s.getStepsCount() < 0) {
                time = s.getTimestamp();
                continue;
            }
            time = s.getTimestamp();
            totalSteps += s.getStepsCount();
        }
        return totalSteps;
    }

    @Override
    public String getStrategyDescription() {
        return "Strategy = FilteredStepCountStrategy";
    }
}
