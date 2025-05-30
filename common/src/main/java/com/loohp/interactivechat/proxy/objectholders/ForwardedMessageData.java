/*
 * This file is part of InteractiveChat4.
 *
 * Copyright (C) 2020 - 2025. LoohpJames <jamesloohp@gmail.com>
 * Copyright (C) 2020 - 2025. Contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <https://www.gnu.org/licenses/>.
 */

package com.loohp.interactivechat.proxy.objectholders;

public class ForwardedMessageData {

    private String message;
    private ChatPacketType packetType;
    private long timeStamp;

    public ForwardedMessageData(String message, ChatPacketType packetType, long timeStamp) {
        this.message = message;
        this.packetType = packetType;
        this.timeStamp = timeStamp;
    }

    public String getMessage() {
        return message;
    }

    public ChatPacketType getPacketType() {
        return packetType;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

}
