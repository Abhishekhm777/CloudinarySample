package com.cloudinary.android;

import com.cloudinary.android.payload.Payload;

class UploadContext<T extends Payload> {
    private final T payload;
    private final RequestDispatcher dispatcher;

    UploadContext(T payload, RequestDispatcher requestDispatcher) {
        this.payload = payload;
        this.dispatcher = requestDispatcher;
    }

    public T getPayload() {
        return payload;
    }

    RequestDispatcher getDispatcher() {
        return dispatcher;
    }
}
