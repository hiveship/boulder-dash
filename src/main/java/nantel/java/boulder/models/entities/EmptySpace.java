package nantel.java.boulder.models.entities;

import java.awt.image.BufferedImage;

import nantel.java.boulder.models.entities.animations.SpriteRepository;

public class EmptySpace implements Entity
{
	private static final long serialVersionUID = -5996713955390260654L;
	private static final String SPRITE_NAME = "emptyspace";

	@Override
	public boolean isMovable()
	{
		return false;
	}

	@Override
	public boolean isConsomable()
	{
		return true; // No problem to walk on an empty space.
	}

	@Override
	public boolean isExplodable()
	{
		return false;
	}

	@Override
	public boolean isRounded()
	{
		return true;
	}

	@Override
	public String getName()
	{
		return "  ";
	}

	@Override
	public boolean isUnique()
	{
		return false;
	}

	@Override
	public boolean isAnimated()
	{
		return false;
	}

	@Override
	public boolean canChainExplosion()
	{
		return true;
	}

	public static String getSpriteName()
	{
		return SPRITE_NAME;
	}

	@Override
	public BufferedImage getSprite()
	{
		return getSpriteSheet();
	}

	//======================
	// SPRITESHEET SINGLETON
	//======================

	private static final class InstanceHolder // This class is only loaded on first access.
	{
		private static final BufferedImage spriteSheet = SpriteRepository.load(getSpriteName());

		private InstanceHolder()
		{
			// prevent instantiation
		}
	}

	static BufferedImage getSpriteSheet()
	{
		return InstanceHolder.spriteSheet;
	}

}
