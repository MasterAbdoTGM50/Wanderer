package matgm50.wanderer.util;

import net.minecraft.entity.Entity;
import net.minecraft.util.EntityDamageSource;

public class DamageSourceNameless extends EntityDamageSource {

    public DamageSourceNameless(String type, Entity source) {

        super(type, source);
        setDamageBypassesArmor();
        setDamageIsAbsolute();

    }

}
