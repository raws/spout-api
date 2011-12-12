/*
 * This file is part of SpoutcraftAPI (http://wiki.getspout.org/).
 * 
 * SpoutcraftAPI is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * SpoutcraftAPI is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.getspout.commons.addon;

import java.io.File;

import org.getspout.commons.addon.java.JavaAddon;
import org.getspout.commons.addon.AddonDescriptionFile;

public final class ServerAddon extends JavaAddon {

	public ServerAddon(String name, String version, String main) {
		//TODO fix
		//initialize(null, Spoutcraft.getClient(), new AddonDescriptionFile(name, version, main), new File(Spoutcraft.getClient().getAddonFolder(), name), null, null);
	}

	@Override
	public void onEnable() {
	}

	@Override
	public void onDisable() {
	}

	public boolean equals(Object other) {
		if (other instanceof JavaAddon) {
			return ((JavaAddon) other).getDescription().getName().equals(getDescription().getName());
		}
		return false;
	}
}