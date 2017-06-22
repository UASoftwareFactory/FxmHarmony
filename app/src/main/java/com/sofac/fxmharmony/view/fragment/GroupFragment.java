package com.sofac.fxmharmony.view.fragment;


import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.sofac.fxmharmony.Constants;
import com.sofac.fxmharmony.R;
import com.sofac.fxmharmony.data.DataManager;
import com.sofac.fxmharmony.data.dto.CommentDTO;
import com.sofac.fxmharmony.data.dto.PostDTO;
import com.sofac.fxmharmony.data.dto.base.ServerRequest;
import com.sofac.fxmharmony.data.dto.base.ServerResponse;

import java.util.List;

import timber.log.Timber;

import static com.sofac.fxmharmony.Constants.DELETE_COMMENT_REQUEST;
import static com.sofac.fxmharmony.Constants.UPDATE_COMMENT_REQUEST;
import static com.sofac.fxmharmony.Constants.UPDATE_POST_REQUEST;


public class GroupFragment extends Fragment {


    public GroupFragment() {

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_group, container, false);

    }


   /* public void onClick(View v) {
        String password ="";
        String login = "";

        new GroupExchangeOnServer().execute();

    }*/

    private class GroupExchangeOnServer<T> extends AsyncTask<String, Void, String> {

        private ServerResponse<List<PostDTO>> loadAllPostsServerResponse;
        private ServerResponse<List<CommentDTO>> loadCommentsServerResponse;
        private ServerResponse serverResponse;

        private String type;
        private T serverObject;

        private GroupExchangeOnServer(T serverObject, String type) {
            this.serverObject = serverObject;
            this.type = type;
        }

        @Override
        protected void onPreExecute() {
            // progress dialog
        }

        @Override
        @SuppressWarnings("unchecked")
        protected String doInBackground(String... urls) {

            ServerRequest serverRequest = new ServerRequest(type, null);
            DataManager dataManager = DataManager.getInstance();

            switch (type) {
                case Constants.LOAD_ALL_POSTS_REQUEST:

                    serverResponse = dataManager.postGroupRequest(serverRequest, type);

                    break;
                case Constants.LOAD_COMMENTS_REQUEST: {

                    Long postID = (Long) serverObject;
                    serverRequest.setDataTransferObject(postID);

                    serverResponse = dataManager.postGroupRequest(serverRequest, type);

                    break;
                }
                case Constants.WRITE_POST_REQUEST: {

                    PostDTO postDTO = (PostDTO) serverObject;
                    serverRequest.setDataTransferObject(postDTO);

                    serverResponse = dataManager.postGroupRequest(serverRequest, type);

                    break;
                }
                case Constants.WRITE_COMMENT_REQUEST: {

                    CommentDTO commentDTO = (CommentDTO) serverObject;
                    serverRequest.setDataTransferObject(commentDTO);

                    serverResponse = dataManager.postGroupRequest(serverRequest, type);

                    break;
                }
                case Constants.DELETE_POST_REQUEST: {

                    Long postID = (Long) serverObject;
                    serverRequest.setDataTransferObject(postID);

                    serverResponse = dataManager.postGroupRequest(serverRequest, type);

                    break;
                }
                case DELETE_COMMENT_REQUEST:

                    Long commentID = (Long) serverObject;
                    serverRequest.setDataTransferObject(commentID);

                    serverResponse = dataManager.postGroupRequest(serverRequest, type);

                    break;
                case UPDATE_POST_REQUEST: {

                    PostDTO postDTO = (PostDTO) serverObject;
                    serverRequest.setDataTransferObject(postDTO);

                    serverResponse = dataManager.postGroupRequest(serverRequest, type);

                    break;
                }
                case UPDATE_COMMENT_REQUEST: {

                    CommentDTO commentDTO = (CommentDTO) serverObject;
                    serverRequest.setDataTransferObject(commentDTO);

                    serverResponse = dataManager.postGroupRequest(serverRequest, type);

                    break;
                }
            }

            if (serverResponse != null) {
                return serverResponse.getResponseStatus();
            }


            return Constants.SERVER_REQUEST_ERROR;
        }


        @Override
        protected void onPostExecute(String result) {
            Timber.e("Response Server: " + result);

            if (result.equals(Constants.REQUEST_SUCCESS)) {

                switch (type) {
                    case Constants.LOAD_ALL_POSTS_REQUEST:

                        loadAllPostsServerResponse = serverResponse;

                        break;
                    case Constants.LOAD_COMMENTS_REQUEST: {

                        loadCommentsServerResponse = serverResponse;

                        break;
                    }
                }
            } else {
                Toast.makeText(getActivity(), R.string.errorConnection, Toast.LENGTH_SHORT).show();
            }
        }
    }
}


