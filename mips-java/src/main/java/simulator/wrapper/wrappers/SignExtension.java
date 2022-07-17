package simulator.wrapper.wrappers;

import simulator.network.Link;
import simulator.wrapper.Wrapper;

public class SignExtension extends Wrapper {

    public SignExtension(String label, String stream, Link... links) {
        super(label, stream, links);
    }

    @Override
    public void initialize() {
        for (int index = 0; index < outputSize/2; index++)
            addOutput(getInput(index));
        for (int index = outputSize/2; index < outputSize; index++)
            addOutput(getInput(0));

    }

}
