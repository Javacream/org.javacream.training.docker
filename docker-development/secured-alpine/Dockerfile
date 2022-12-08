FROM alpine

ENV USER_NAME=hugo
ENV UID=12345
ENV GID=23456

RUN addgroup "$USER_NAME"
RUN adduser \
    --disabled-password \
    --gecos "" \
    --home "$(pwd)" \
    --ingroup "$USER_NAME" \
    --no-create-home \
    --uid "$UID" \
    "$USER_NAME"
USER "$USER_NAME"    