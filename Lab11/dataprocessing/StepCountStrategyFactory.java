package dataprocessing;

import main.Utils;
import storage.DataRepository;

public class StepCountStrategyFactory {

    private static StepCountStrategyFactory instance = null;

    private StepCountStrategyFactory() {

    }

    public static StepCountStrategyFactory getInstance() {
        if(instance == null) {
            instance = new StepCountStrategyFactory();
        }
        return instance;
    }

    public StepCountStrategy createStrategy(String strategyType, DataRepository dataRepository) {
        if(strategyType.equals(Utils.BASIC_STRATEGY)) {
            return new BasicStepCountStrategy(dataRepository);
        }
        return new FilteredStepCountStrategy(dataRepository);
    }
}
