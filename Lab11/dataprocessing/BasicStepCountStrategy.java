package dataprocessing;

import storage.DataRepository;
import storage.SensorData;

public class BasicStepCountStrategy implements  StepCountStrategy {

    private DataRepository dataRepository;

    public BasicStepCountStrategy(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    @Override
    public int getTotalSteps() {
        int totalSteps = 0;
        for(SensorData s : dataRepository.getData()) {
            totalSteps += s.getStepsCount();
        }
        return totalSteps;
    }

    @Override
    public String getStrategyDescription() {
        return "Strategy = BasicStepCountStrategy";
    }
}
