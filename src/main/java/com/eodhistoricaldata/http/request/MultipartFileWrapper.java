/*
 * EODHistoricalDataFundamentalLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.eodhistoricaldata.http.request;

import com.eodhistoricaldata.http.Headers;
import com.eodhistoricaldata.utilities.FileWrapper;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Class to wrap file and headers to be sent as part of a multipart request.
 */
public class MultipartFileWrapper {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private FileWrapper fileWrapper;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Headers headers;

    /**
     * Initialization constructor.
     * @param fileWrapper FileWrapper instance
     * @param headers Headers for wrapping
     */
    public MultipartFileWrapper(FileWrapper fileWrapper, Headers headers) {
        this.fileWrapper = fileWrapper;
        this.headers = headers;
    }

    /**
     * Getter for file wrapper.
     * @return FileWrapper instance
     */
    public FileWrapper getFileWrapper() {
        return fileWrapper;
    }

    /**
     * Getter for headers.
     * @return Headers
     */
    public Headers getHeaders() {
        return headers;
    }
}
