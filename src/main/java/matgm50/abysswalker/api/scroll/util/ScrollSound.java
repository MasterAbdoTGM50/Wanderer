package matgm50.abysswalker.api.scroll.util;

import net.minecraft.client.audio.ISound;
import net.minecraft.util.ResourceLocation;

/**
 * Created by MasterAbdoTGM50 on 7/6/2014.
 */

public class ScrollSound implements ISound {

    private String soundEvent;

    public ScrollSound(String soundEvent) {

        this.soundEvent = soundEvent;
    }

    @Override
    public ResourceLocation getPositionedSoundLocation() {return new ResourceLocation("abysswalker", soundEvent);}

    @Override
    public boolean canRepeat() {return false;}

    @Override
    public int getRepeatDelay() {return 0;}

    @Override
    public float getVolume() {return .5F;}

    @Override
    public float getPitch() {return 1.0F;}

    @Override
    public float getXPosF() {return 0;}

    @Override
    public float getYPosF() {return 0;}

    @Override
    public float getZPosF() {return 0;}

    @Override
    public AttenuationType getAttenuationType() {return AttenuationType.NONE;}

}
